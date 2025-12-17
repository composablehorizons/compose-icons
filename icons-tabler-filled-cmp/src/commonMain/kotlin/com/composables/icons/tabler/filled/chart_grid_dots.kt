package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartGridDots: ImageVector
    get() {
        if (_ChartGridDots != null) return _ChartGridDots!!
        
        _ChartGridDots = ImageVector.Builder(
            name = "chart-grid-dots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, 1.83f)
                lineToRelative(0.17f, -0.001f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, 1.83f)
                lineToRelative(0.17f, -0.001f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 0.171f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.829f, -1.83f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 0.171f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.829f, -1.83f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-0.34f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.829f, -1.83f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-2.17f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-0.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-7f, 11f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.828f, 1.829f)
                verticalLineToRelative(0.342f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.828f, 1.829f)
                horizontalLineToRelative(2.171f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(6f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, -1.83f)
                verticalLineToRelative(-2.17f)
                close()
                moveToRelative(-6f, -6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, 1.83f, 1.83f)
                lineToRelative(2.17f, -0.001f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(4.171f, 0f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.17f)
                arcToRelative(3.008f, 3.008f, 0f, false, true, -1.829f, -1.83f)
                close()
            }
        }.build()
        
        return _ChartGridDots!!
    }

private var _ChartGridDots: ImageVector? = null

