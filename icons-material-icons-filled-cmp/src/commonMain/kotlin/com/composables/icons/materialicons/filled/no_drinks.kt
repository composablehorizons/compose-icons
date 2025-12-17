package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_drinks: ImageVector
    get() {
        if (_No_drinks != null) return _No_drinks!!
        
        _No_drinks = ImageVector.Builder(
            name = "no_drinks",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5.83f, 3f)
                    horizontalLineTo(21f)
                    verticalLineToRelative(2f)
                    lineToRelative(-6.2f, 6.97f)
                    lineTo(9.83f, 7f)
                    horizontalLineToRelative(6.74f)
                    lineToRelative(1.78f, -2f)
                    horizontalLineTo(7.83f)
                    lineTo(5.83f, 3f)
                    close()
                    moveTo(19.78f, 22.61f)
                    lineTo(18f, 20.83f)
                    verticalLineTo(21f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-5f)
                    lineToRelative(-1.37f, -1.54f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(3f, 3f)
                    lineToRelative(18.19f, 18.19f)
                    lineTo(19.78f, 22.61f)
                    close()
                    moveTo(16.17f, 19f)
                    lineTo(13f, 15.83f)
                    verticalLineTo(19f)
                    horizontalLineTo(16.17f)
                    close()
                }
            }
        }.build()
        
        return _No_drinks!!
    }

private var _No_drinks: ImageVector? = null

