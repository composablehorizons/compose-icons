package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Edit_off: ImageVector
    get() {
        if (_Edit_off != null) return _Edit_off!!
        
        _Edit_off = ImageVector.Builder(
            name = "edit_off",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(14.06f, 9.02f)
                        lineToRelative(0.92f, 0.92f)
                        lineToRelative(-1.11f, 1.11f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(2.52f, -2.52f)
                        lineToRelative(-3.75f, -3.75f)
                        lineToRelative(-2.52f, 2.52f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(14.06f, 9.02f)
                        close()
                        moveTo(20.71f, 7.04f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-2.34f, -2.34f)
                        curveTo(18.17f, 3.09f, 17.92f, 3f, 17.66f, 3f)
                        reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f)
                        lineToRelative(-1.83f, 1.83f)
                        lineToRelative(3.75f, 3.75f)
                        lineTo(20.71f, 7.04f)
                        close()
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(7.32f, 7.32f)
                        lineTo(3f, 17.25f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(3.75f)
                        lineToRelative(5.71f, -5.71f)
                        lineToRelative(7.32f, 7.32f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(5.92f, 19f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-0.92f)
                        lineToRelative(5.13f, -5.13f)
                        lineToRelative(0.92f, 0.92f)
                        lineTo(5.92f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edit_off!!
    }

private var _Edit_off: ImageVector? = null

