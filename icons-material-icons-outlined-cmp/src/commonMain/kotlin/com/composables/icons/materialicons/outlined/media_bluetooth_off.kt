package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Media_bluetooth_off: ImageVector
    get() {
        if (_Media_bluetooth_off != null) return _Media_bluetooth_off!!
        
        _Media_bluetooth_off = ImageVector.Builder(
            name = "media_bluetooth_off",
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
                        moveTo(9f, 6.17f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(1.17f)
                        lineTo(9f, 6.17f)
                        close()
                        moveTo(19.42f, 15f)
                        lineTo(22f, 17.57f)
                        lineToRelative(-0.8f, 0.8f)
                        lineToRelative(-6.78f, -6.78f)
                        lineToRelative(0.8f, -0.8f)
                        lineToRelative(2.75f, 2.75f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(0.6f)
                        lineTo(22f, 12.43f)
                        lineTo(19.42f, 15f)
                        close()
                        moveTo(19.17f, 13.55f)
                        lineToRelative(1.13f, -1.13f)
                        lineToRelative(-1.13f, -1.13f)
                        verticalLineTo(13.55f)
                        close()
                        moveTo(21.19f, 21.19f)
                        lineToRelative(-1.41f, 1.41f)
                        lineToRelative(-3.98f, -3.98f)
                        lineToRelative(-0.58f, 0.58f)
                        lineToRelative(-0.85f, -0.85f)
                        lineToRelative(0.58f, -0.58f)
                        lineTo(11f, 13.83f)
                        verticalLineTo(17f)
                        curveToRelative(0f, 2.21f, -1.78f, 4f, -3.99f, 4f)
                        reflectiveCurveTo(3f, 19.21f, 3f, 17f)
                        reflectiveCurveToRelative(1.79f, -4f, 4.01f, -4f)
                        curveToRelative(0.73f, 0f, 1.41f, 0.21f, 2f, 0.55f)
                        verticalLineToRelative(-1.72f)
                        lineTo(1.39f, 4.22f)
                        lineTo(2.8f, 2.81f)
                        lineTo(21.19f, 21.19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Media_bluetooth_off!!
    }

private var _Media_bluetooth_off: ImageVector? = null

