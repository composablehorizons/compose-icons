package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TemperaturePlus: ImageVector
    get() {
        if (_TemperaturePlus != null) return _TemperaturePlus!!
        
        _TemperaturePlus = ImageVector.Builder(
            name = "temperature-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(7.965f)
                lineToRelative(0.075f, 0.056f)
                arcToRelative(5f, 5f, 0f, false, true, 1.81f, 5.01f)
                lineToRelative(-0.055f, 0.227f)
                arcToRelative(5f, 5f, 0f, true, true, -7.905f, -5.237f)
                lineToRelative(0.075f, -0.056f)
                verticalLineToRelative(-7.965f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                close()
                moveToRelative(9f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(-9f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _TemperaturePlus!!
    }

private var _TemperaturePlus: ImageVector? = null

