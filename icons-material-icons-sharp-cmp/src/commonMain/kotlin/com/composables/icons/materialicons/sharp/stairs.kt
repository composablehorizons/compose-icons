package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stairs: ImageVector
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
                            moveTo(3f, 3f)
                            verticalLineToRelative(18f)
                            horizontalLineToRelative(18f)
                            verticalLineTo(3f)
                            horizontalLineTo(3f)
                            close()
                            moveTo(18f, 8f)
                            horizontalLineToRelative(-2.42f)
                            verticalLineToRelative(3.33f)
                            horizontalLineTo(13f)
                            verticalLineToRelative(3.33f)
                            horizontalLineToRelative(-2.58f)
                            verticalLineTo(18f)
                            horizontalLineTo(6f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2.42f)
                            verticalLineToRelative(-3.33f)
                            horizontalLineTo(11f)
                            verticalLineTo(9.33f)
                            horizontalLineToRelative(2.58f)
                            verticalLineTo(6f)
                            horizontalLineTo(18f)
                            verticalLineTo(8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Stairs!!
    }

private var _Stairs: ImageVector? = null

