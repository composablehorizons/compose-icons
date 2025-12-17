package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`19mp`: ImageVector
    get() {
        if (_19mp != null) return _19mp!!
        
        _19mp = ImageVector.Builder(
            name = "19mp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 460f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(60f, -140f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(240f, 740f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(300f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-180f)
                horizontalLineTo(540f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -120f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _19mp!!
    }

private var _19mp: ImageVector? = null

