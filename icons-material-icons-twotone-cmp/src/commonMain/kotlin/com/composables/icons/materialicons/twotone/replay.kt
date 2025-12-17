package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Replay: ImageVector
    get() {
        if (_Replay != null) return _Replay!!
        
        _Replay = ImageVector.Builder(
            name = "replay",
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
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 6f)
                    lineToRelative(5f, 5f)
                    verticalLineTo(7f)
                    curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                    reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                    reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                    horizontalLineTo(4f)
                    curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                    reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                    curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                    verticalLineTo(1f)
                    lineTo(7f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Replay!!
    }

private var _Replay: ImageVector? = null

