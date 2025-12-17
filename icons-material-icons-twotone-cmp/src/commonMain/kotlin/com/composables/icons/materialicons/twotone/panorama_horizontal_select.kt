package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Panorama_horizontal_select: ImageVector
    get() {
        if (_Panorama_horizontal_select != null) return _Panorama_horizontal_select!!
        
        _Panorama_horizontal_select = ImageVector.Builder(
            name = "panorama_horizontal_select",
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
                        moveTo(4f, 6.38f)
                        verticalLineToRelative(11.25f)
                        curveToRelative(2.01f, -0.59f, 4.61f, -1.13f, 8f, -1.13f)
                        curveToRelative(3.38f, 0f, 5.99f, 0.54f, 8f, 1.13f)
                        verticalLineTo(6.37f)
                        curveToRelative(-2.01f, 0.59f, -4.62f, 1.13f, -8f, 1.13f)
                        curveTo(9.32f, 7.5f, 6.58f, 7.11f, 4f, 6.38f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.01f, 4f)
                        curveTo(20.45f, 4f, 17.4f, 5.5f, 12f, 5.5f)
                        curveToRelative(-5.31f, 0f, -8.49f, -1.49f, -9.01f, -1.49f)
                        curveTo(2.46f, 4.01f, 2f, 4.45f, 2f, 5.02f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 0.57f, 0.46f, 1f, 0.99f, 1f)
                        curveToRelative(0.57f, 0f, 3.55f, -1.5f, 9.01f, -1.5f)
                        curveToRelative(5.42f, 0f, 8.44f, 1.5f, 9.01f, 1.5f)
                        curveToRelative(0.53f, 0f, 0.99f, -0.43f, 0.99f, -1f)
                        verticalLineTo(5f)
                        curveTo(22f, 4.43f, 21.54f, 4f, 21.01f, 4f)
                        close()
                        moveTo(20f, 17.63f)
                        curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8f, -1.13f)
                        curveToRelative(-3.39f, 0f, -5.99f, 0.54f, -8f, 1.13f)
                        verticalLineTo(6.38f)
                        curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12f, 7.5f)
                        curveToRelative(3.38f, 0f, 5.99f, -0.54f, 8f, -1.13f)
                        verticalLineTo(17.63f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Panorama_horizontal_select!!
    }

private var _Panorama_horizontal_select: ImageVector? = null

