package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Wrong_location: ImageVector
    get() {
        if (_Wrong_location != null) return _Wrong_location!!
        
        _Wrong_location = ImageVector.Builder(
            name = "wrong_location",
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
                        moveTo(18f, 11f)
                        curveToRelative(0f, 0.07f, 0f, 0.13f, 0f, 0.2f)
                        curveToRelative(0f, 2.34f, -1.95f, 5.44f, -6f, 9.14f)
                        curveToRelative(-4.05f, -3.7f, -6f, -6.79f, -6f, -9.14f)
                        curveTo(6f, 7.57f, 8.65f, 5f, 12f, 5f)
                        curveToRelative(0.34f, 0f, 0.68f, 0.03f, 1f, 0.08f)
                        verticalLineTo(3.06f)
                        curveTo(12.67f, 3.02f, 12.34f, 3f, 12f, 3f)
                        curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                        curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                        curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                        curveToRelative(0f, -0.07f, 0f, -0.13f, 0f, -0.2f)
                        horizontalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 11f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 13f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 11f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.54f, 2.88f)
                        lineTo(21.12f, 1.46f)
                        lineTo(19f, 3.59f)
                        lineTo(16.88f, 1.46f)
                        lineTo(15.46f, 2.88f)
                        lineTo(17.59f, 5f)
                        lineTo(15.46f, 7.12f)
                        lineTo(16.88f, 8.54f)
                        lineTo(19f, 6.41f)
                        lineTo(21.12f, 8.54f)
                        lineTo(22.54f, 7.12f)
                        lineTo(20.41f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wrong_location!!
    }

private var _Wrong_location: ImageVector? = null

