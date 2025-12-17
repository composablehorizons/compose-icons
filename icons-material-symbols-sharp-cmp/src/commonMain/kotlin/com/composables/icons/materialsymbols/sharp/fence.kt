package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fence: ImageVector
    get() {
        if (_Fence != null) return _Fence!!
        
        _Fence = ImageVector.Builder(
            name = "fence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                lineToRelative(120f, -120f)
                lineToRelative(80f, 80f)
                lineToRelative(81f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(80f, -80f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(160f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-87f)
                lineToRelative(-40f, -40f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-87f)
                lineToRelative(-40f, -40f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(161f, 0f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(-87f)
                lineToRelative(-40f, -40f)
                lineToRelative(-39f, 39f)
                verticalLineToRelative(88f)
                close()
                moveTo(280f, 560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(161f, 0f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(161f, 0f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Fence!!
    }

private var _Fence: ImageVector? = null

