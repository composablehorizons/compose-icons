package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Two_pager_store: ImageVector
    get() {
        if (_Two_pager_store != null) return _Two_pager_store!!
        
        _Two_pager_store = ImageVector.Builder(
            name = "two_pager_store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(520f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, 80f)
                verticalLineToRelative(-170f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(170f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-48f, -160f)
                lineToRelative(40f, -200f)
                horizontalLineToRelative(336f)
                lineToRelative(40f, 200f)
                horizontalLineTo(512f)
                close()
                moveToRelative(97f, -80f)
                horizontalLineToRelative(222f)
                lineToRelative(-8f, -40f)
                horizontalLineTo(617f)
                lineToRelative(-8f, 40f)
                close()
                moveToRelative(-409f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Two_pager_store!!
    }

private var _Two_pager_store: ImageVector? = null

