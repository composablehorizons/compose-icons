package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Media_bluetooth_on: ImageVector
    get() {
        if (_Media_bluetooth_on != null) return _Media_bluetooth_on!!
        
        _Media_bluetooth_on = ImageVector.Builder(
            name = "media_bluetooth_on",
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
                        moveTo(9f, 3f)
                        lineToRelative(0.01f, 10.55f)
                        curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2f, -0.55f)
                        curveTo(4.79f, 13f, 3f, 14.79f, 3f, 17f)
                        reflectiveCurveToRelative(1.79f, 4f, 4.01f, 4f)
                        reflectiveCurveTo(11f, 19.21f, 11f, 17f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        close()
                        moveTo(21f, 12.43f)
                        lineTo(17.57f, 9f)
                        horizontalLineToRelative(-0.6f)
                        verticalLineToRelative(4.55f)
                        lineToRelative(-2.75f, -2.75f)
                        lineToRelative(-0.85f, 0.85f)
                        lineTo(16.73f, 15f)
                        lineToRelative(-3.35f, 3.35f)
                        lineToRelative(0.85f, 0.85f)
                        lineToRelative(2.75f, -2.75f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(0.6f)
                        lineTo(21f, 17.57f)
                        lineTo(18.42f, 15f)
                        lineTo(21f, 12.43f)
                        close()
                        moveTo(18.17f, 11.3f)
                        lineToRelative(1.13f, 1.13f)
                        lineToRelative(-1.13f, 1.13f)
                        verticalLineTo(11.3f)
                        close()
                        moveTo(19.3f, 17.57f)
                        lineToRelative(-1.13f, 1.13f)
                        verticalLineToRelative(-2.26f)
                        lineTo(19.3f, 17.57f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Media_bluetooth_on!!
    }

private var _Media_bluetooth_on: ImageVector? = null

