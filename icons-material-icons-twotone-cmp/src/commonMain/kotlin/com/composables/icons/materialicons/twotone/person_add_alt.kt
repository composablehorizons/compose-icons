package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Person_add_alt: ImageVector
    get() {
        if (_Person_add_alt != null) return _Person_add_alt!!
        
        _Person_add_alt = ImageVector.Builder(
            name = "person_add_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 9f, 10f)
                        arcTo(2f, 2f, 0f, false, true, 7f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 11f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.48f, 16.34f)
                        curveTo(13.29f, 15.73f, 11.37f, 15f, 9f, 15f)
                        curveToRelative(-2.37f, 0f, -4.29f, 0.73f, -5.48f, 1.34f)
                        curveTo(3.2f, 16.5f, 3f, 16.84f, 3f, 17.22f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-0.78f)
                        curveTo(15f, 16.84f, 14.8f, 16.5f, 14.48f, 16.34f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 12f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveTo(5f, 5.79f, 5f, 8f)
                        curveTo(5f, 10.21f, 6.79f, 12f, 9f, 12f)
                        close()
                        moveTo(9f, 6f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveTo(7f, 9.1f, 7f, 8f)
                        curveTo(7f, 6.9f, 7.9f, 6f, 9f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 9f)
                        lineTo(20f, 6f)
                        lineTo(18f, 6f)
                        lineTo(18f, 9f)
                        lineTo(15f, 9f)
                        lineTo(15f, 11f)
                        lineTo(18f, 11f)
                        lineTo(18f, 14f)
                        lineTo(20f, 14f)
                        lineTo(20f, 11f)
                        lineTo(23f, 11f)
                        lineTo(23f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.39f, 14.56f)
                        curveTo(13.71f, 13.7f, 11.53f, 13f, 9f, 13f)
                        curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                        curveTo(1.61f, 15.07f, 1f, 16.1f, 1f, 17.22f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2.78f)
                        curveTo(17f, 16.1f, 16.39f, 15.07f, 15.39f, 14.56f)
                        close()
                        moveTo(15f, 18f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-0.78f)
                        curveToRelative(0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                        curveTo(4.71f, 15.73f, 6.63f, 15f, 9f, 15f)
                        curveToRelative(2.37f, 0f, 4.29f, 0.73f, 5.48f, 1.34f)
                        curveTo(14.8f, 16.5f, 15f, 16.84f, 15f, 17.22f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Person_add_alt!!
    }

private var _Person_add_alt: ImageVector? = null

