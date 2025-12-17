package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Person_add_alt_1: ImageVector
    get() {
        if (_Person_add_alt_1 != null) return _Person_add_alt_1!!
        
        _Person_add_alt_1 = ImageVector.Builder(
            name = "person_add_alt_1",
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
                        moveTo(9f, 16f)
                        curveToRelative(-2.7f, 0f, -5.8f, 1.29f, -6f, 2f)
                        horizontalLineToRelative(12f)
                        curveTo(14.78f, 17.28f, 11.69f, 16f, 9f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 14f)
                        curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2f)
                        curveTo(17f, 15.34f, 11.67f, 14f, 9f, 14f)
                        close()
                        moveTo(3f, 18f)
                        curveToRelative(0.2f, -0.71f, 3.3f, -2f, 6f, -2f)
                        curveToRelative(2.69f, 0f, 5.78f, 1.28f, 6f, 2f)
                        horizontalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 10f)
                        lineTo(20f, 7f)
                        lineTo(18f, 7f)
                        lineTo(18f, 10f)
                        lineTo(15f, 10f)
                        lineTo(15f, 12f)
                        lineTo(18f, 12f)
                        lineTo(18f, 15f)
                        lineTo(20f, 15f)
                        lineTo(20f, 12f)
                        lineTo(23f, 12f)
                        lineTo(23f, 10f)
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
                }
            }
        }.build()
        
        return _Person_add_alt_1!!
    }

private var _Person_add_alt_1: ImageVector? = null

