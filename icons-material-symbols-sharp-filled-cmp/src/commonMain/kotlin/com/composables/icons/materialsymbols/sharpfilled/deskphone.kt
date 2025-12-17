package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Deskphone: ImageVector
    get() {
        if (_Deskphone != null) return _Deskphone!!
        
        _Deskphone = ImageVector.Builder(
            name = "deskphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(120f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(720f)
                horizontalLineTo(600f)
                verticalLineToRelative(-40f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Deskphone!!
    }

private var _Deskphone: ImageVector? = null

