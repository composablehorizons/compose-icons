package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Calculator: ImageVector
    get() {
        if (_Calculator != null) return _Calculator!!
        
        _Calculator = ImageVector.Builder(
            name = "calculator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.75f, 15.75f)
                verticalLineTo(18f)
                moveToRelative(-7.5f, -6.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(8.25f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(8.25f)
                verticalLineTo(13.5f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(8.25f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(8.25f)
                verticalLineTo(18f)
                close()
                moveToRelative(2.498f, -6.75f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                verticalLineTo(13.5f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                verticalLineTo(18f)
                close()
                moveToRelative(2.504f, -6.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(13.5f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(18f)
                close()
                moveToRelative(2.498f, -6.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(13.5f)
                close()
                moveTo(8.25f, 6f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(-7.5f)
                verticalLineTo(6f)
                close()
                moveTo(12f, 2.25f)
                curveToRelative(-1.892f, 0f, -3.758f, 0.11f, -5.593f, 0.322f)
                curveTo(5.307f, 2.7f, 4.5f, 3.65f, 4.5f, 4.757f)
                verticalLineTo(19.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(4.757f)
                curveToRelative(0f, -1.108f, -0.806f, -2.057f, -1.907f, -2.185f)
                arcTo(48.507f, 48.507f, 0f, false, false, 12f, 2.25f)
                close()
            }
        }.build()
        
        return _Calculator!!
    }

private var _Calculator: ImageVector? = null

