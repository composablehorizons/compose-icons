package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Modeling: ImageVector
    get() {
        if (_Modeling != null) return _Modeling!!
        
        _Modeling = ImageVector.Builder(
            name = "modeling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 820f)
                lineTo(560f, 660f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 56f)
                lineToRelative(-63f, 64f)
                horizontalLineToRelative(167f)
                verticalLineToRelative(80f)
                horizontalLineTo(713f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -340f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(240f, -20f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(280f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Modeling!!
    }

private var _Modeling: ImageVector? = null

