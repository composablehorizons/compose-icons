package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Reviews: ImageVector
    get() {
        if (_Reviews != null) return _Reviews!!
        
        _Reviews = ImageVector.Builder(
            name = "reviews",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(20f)
                    lineToRelative(4f, -4f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(2f)
                    close()
                    moveTo(13.57f, 11.57f)
                    lineTo(12f, 15f)
                    lineToRelative(-1.57f, -3.43f)
                    lineTo(7f, 10f)
                    lineToRelative(3.43f, -1.57f)
                    lineTo(12f, 5f)
                    lineToRelative(1.57f, 3.43f)
                    lineTo(17f, 10f)
                    lineTo(13.57f, 11.57f)
                    close()
                }
            }
        }.build()
        
        return _Reviews!!
    }

private var _Reviews: ImageVector? = null

