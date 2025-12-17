package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SunHigh: ImageVector
    get() {
        if (_SunHigh != null) return _SunHigh!!
        
        _SunHigh = ImageVector.Builder(
            name = "sun-high",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 19f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(-4.95f, -2.05f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, -1.414f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                moveToRelative(11.314f, 0f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                moveToRelative(-5.049f, -9.836f)
                arcToRelative(5f, 5f, 0f, true, true, -2.532f, 9.674f)
                arcToRelative(5f, 5f, 0f, false, true, 2.532f, -9.674f)
                moveToRelative(-9.315f, 3.886f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
                moveToRelative(18f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                close()
                moveToRelative(-16.364f, -6.778f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                moveToRelative(14.142f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                moveToRelative(-7.778f, -3.222f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _SunHigh!!
    }

private var _SunHigh: ImageVector? = null

