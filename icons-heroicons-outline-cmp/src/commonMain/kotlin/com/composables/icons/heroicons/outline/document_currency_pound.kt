package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DocumentCurrencyPound: ImageVector
    get() {
        if (_DocumentCurrencyPound != null) return _DocumentCurrencyPound!!
        
        _DocumentCurrencyPound = ImageVector.Builder(
            name = "document-currency-pound",
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
                moveTo(19.5f, 14.25f)
                verticalLineToRelative(-2.625f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 13.5f, 7.125f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineTo(8.25f)
                moveToRelative(6.621f, 9.879f)
                arcToRelative(3f, 3f, 0f, false, false, -5.02f, 2.897f)
                lineToRelative(0.164f, 0.609f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -0.108f, 2.676f)
                lineToRelative(-0.157f, 0.439f)
                lineToRelative(0.44f, -0.22f)
                arcToRelative(2.863f, 2.863f, 0f, false, true, 2.185f, -0.155f)
                curveToRelative(0.72f, 0.24f, 1.507f, 0.184f, 2.186f, -0.155f)
                lineTo(15f, 18f)
                moveTo(8.25f, 15.75f)
                horizontalLineTo(12f)
                moveToRelative(-1.5f, -13.5f)
                horizontalLineTo(5.625f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(11.25f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyPound!!
    }

private var _DocumentCurrencyPound: ImageVector? = null

