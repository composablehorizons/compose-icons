package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Banknotes: ImageVector
    get() {
        if (_Banknotes != null) return _Banknotes!!
        
        _Banknotes = ImageVector.Builder(
            name = "banknotes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                close()
                moveToRelative(12f, 4f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
                moveTo(4f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveToRelative(13f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(1.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                curveToRelative(4.417f, 0f, 8.693f, 0.603f, 12.749f, 1.73f)
                curveToRelative(1.111f, 0.309f, 2.251f, -0.512f, 2.251f, -1.696f)
                verticalLineToRelative(-0.784f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.784f)
                arcToRelative(0.272f, 0.272f, 0f, false, true, -0.35f, 0.25f)
                arcTo(49.043f, 49.043f, 0f, false, false, 1.75f, 14.5f)
                close()
            }
        }.build()
        
        return _Banknotes!!
    }

private var _Banknotes: ImageVector? = null

