package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stairs: ImageVector
    get() {
        if (_Stairs != null) return _Stairs!!
        
        _Stairs = ImageVector.Builder(
            name = "stairs",
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 3f)
                            horizontalLineTo(5f)
                            curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(5f)
                            curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                            close()
                            moveTo(17f, 8f)
                            horizontalLineToRelative(-1.42f)
                            verticalLineToRelative(3.33f)
                            horizontalLineTo(13f)
                            verticalLineToRelative(3.33f)
                            horizontalLineToRelative(-2.58f)
                            lineTo(10.45f, 18f)
                            horizontalLineTo(7f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(1.42f)
                            verticalLineToRelative(-3.33f)
                            horizontalLineTo(11f)
                            verticalLineTo(9.33f)
                            horizontalLineToRelative(2.58f)
                            verticalLineTo(6f)
                            horizontalLineTo(17f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            curveTo(18f, 7.55f, 17.55f, 8f, 17f, 8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Stairs!!
    }

private var _Stairs: ImageVector? = null

