package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Subscriptions: ImageVector
    get() {
        if (_Subscriptions != null) return _Subscriptions!!
        
        _Subscriptions = ImageVector.Builder(
            name = "subscriptions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -120f)
                lineToRelative(240f, -160f)
                lineToRelative(-240f, -160f)
                verticalLineToRelative(320f)
                close()
                moveTo(160f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Subscriptions!!
    }

private var _Subscriptions: ImageVector? = null

