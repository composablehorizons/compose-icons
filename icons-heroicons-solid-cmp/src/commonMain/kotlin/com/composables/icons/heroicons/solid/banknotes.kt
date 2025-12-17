package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Banknotes: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7.5f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, -4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 4.875f)
                curveTo(1.5f, 3.839f, 2.34f, 3f, 3.375f, 3f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(9.75f)
                curveToRelative(0f, 1.036f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(3.375f)
                arcTo(1.875f, 1.875f, 0f, false, true, 1.5f, 14.625f)
                verticalLineToRelative(-9.75f)
                close()
                moveTo(8.25f, 9.75f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, 7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, -7.5f, 0f)
                close()
                moveTo(18.75f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.008f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.008f)
                close()
                moveTo(4.5f, 9.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5.25f, 9f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(9.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                curveToRelative(5.4f, 0f, 10.63f, 0.722f, 15.6f, 2.075f)
                curveToRelative(1.19f, 0.324f, 2.4f, -0.558f, 2.4f, -1.82f)
                verticalLineTo(18.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(2.25f)
                close()
            }
        }.build()
        
        return _Banknotes!!
    }

private var _Banknotes: ImageVector? = null

