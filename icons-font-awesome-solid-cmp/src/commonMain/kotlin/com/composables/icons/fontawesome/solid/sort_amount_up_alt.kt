package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SortAmountUpAlt: ImageVector
    get() {
        if (_SortAmountUpAlt != null) return _SortAmountUpAlt!!
        
        _SortAmountUpAlt = ImageVector.Builder(
            name = "sort-amount-up-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 96f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-64f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                close()
                moveToRelative(0f, 128f)
                horizontalLineToRelative(128f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(240f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                close()
                moveToRelative(256f, 192f)
                horizontalLineTo(240f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(256f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(-256f, -64f)
                horizontalLineToRelative(192f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(240f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                close()
                moveTo(16f, 160f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(304f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(160f)
                horizontalLineToRelative(48f)
                curveToRelative(14.21f, 0f, 21.39f, -17.24f, 11.31f, -27.31f)
                lineToRelative(-80f, -96f)
                arcToRelative(16f, 16f, 0f, false, false, -22.62f, 0f)
                lineToRelative(-80f, 96f)
                curveTo(-5.35f, 142.74f, 1.78f, 160f, 16f, 160f)
                close()
            }
        }.build()
        
        return _SortAmountUpAlt!!
    }

private var _SortAmountUpAlt: ImageVector? = null

