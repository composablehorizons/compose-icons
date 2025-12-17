package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Banknotes: ImageVector
    get() {
        if (_Banknotes != null) return _Banknotes!!
        
        _Banknotes = ImageVector.Builder(
            name = "banknotes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(2.25f, 18.75f)
                arcToRelative(60.07f, 60.07f, 0f, false, true, 15.797f, 2.101f)
                curveToRelative(0.727f, 0.198f, 1.453f, -0.342f, 1.453f, -1.096f)
                verticalLineTo(18.75f)
                moveTo(3.75f, 4.5f)
                verticalLineToRelative(0.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 6f)
                horizontalLineToRelative(-0.75f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-0.375f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineTo(20.25f)
                moveTo(2.25f, 6f)
                verticalLineToRelative(9f)
                moveToRelative(18f, -10.5f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.75f)
                moveToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(9.75f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-0.375f)
                moveToRelative(1.5f, -1.5f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                moveToRelative(0f, 0f)
                horizontalLineTo(3.75f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-0.375f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                verticalLineTo(15f)
                moveToRelative(1.5f, 1.5f)
                verticalLineToRelative(-0.75f)
                arcTo(0.75f, 0.75f, 0f, false, false, 3f, 15f)
                horizontalLineToRelative(-0.75f)
                moveTo(15f, 10.5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(18f)
                verticalLineTo(10.5f)
                close()
                moveToRelative(-12f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Banknotes!!
    }

private var _Banknotes: ImageVector? = null

