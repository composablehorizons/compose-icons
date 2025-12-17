package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_drinks: ImageVector
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
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(8.23f, 8.23f)
                    lineTo(11f, 14f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-0.17f)
                    lineToRelative(1.78f, 1.78f)
                    lineTo(21.19f, 21.19f)
                    close()
                    moveTo(13f, 19f)
                    verticalLineToRelative(-3.17f)
                    lineTo(16.17f, 19f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(7.83f, 5f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(21f)
                    verticalLineToRelative(2f)
                    lineToRelative(-6.2f, 6.97f)
                    lineToRelative(-1.42f, -1.42f)
                    lineTo(14.77f, 9f)
                    horizontalLineToRelative(-2.94f)
                    lineToRelative(-2f, -2f)
                    horizontalLineToRelative(6.74f)
                    lineToRelative(1.78f, -2f)
                    horizontalLineTo(7.83f)
                    close()
                }
            }
        }.build()
        
        return _No_drinks!!
    }

private var _No_drinks: ImageVector? = null

