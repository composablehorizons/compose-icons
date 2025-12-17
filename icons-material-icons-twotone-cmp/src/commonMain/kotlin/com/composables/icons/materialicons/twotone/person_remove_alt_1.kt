package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Person_remove_alt_1: ImageVector
    get() {
        if (_Person_remove_alt_1 != null) return _Person_remove_alt_1!!
        
        _Person_remove_alt_1 = ImageVector.Builder(
            name = "person_remove_alt_1",
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
                        moveTo(10f, 16f)
                        curveToRelative(2.69f, 0f, 5.77f, 1.28f, 6f, 2f)
                        horizontalLineTo(4f)
                        curveTo(4.2f, 17.29f, 7.3f, 16f, 10f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 10f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 8f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        curveTo(7.79f, 4f, 6f, 5.79f, 6f, 8f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveTo(12.21f, 12f, 14f, 10.21f, 14f, 8f)
                        close()
                        moveTo(12f, 8f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                        curveTo(11.1f, 6f, 12f, 6.9f, 12f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 18f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                        curveTo(7.33f, 14f, 2f, 15.34f, 2f, 18f)
                        close()
                        moveTo(4f, 18f)
                        curveToRelative(0.2f, -0.71f, 3.3f, -2f, 6f, -2f)
                        curveToRelative(2.69f, 0f, 5.77f, 1.28f, 6f, 2f)
                        horizontalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 10f)
                        horizontalLineTo(23f)
                        verticalLineTo(12f)
                        horizontalLineTo(17f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Person_remove_alt_1!!
    }

private var _Person_remove_alt_1: ImageVector? = null

