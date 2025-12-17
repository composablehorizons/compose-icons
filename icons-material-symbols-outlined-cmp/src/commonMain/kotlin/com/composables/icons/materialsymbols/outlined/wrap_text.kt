package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wrap_text: ImageVector
    get() {
        if (_Wrap_text != null) return _Wrap_text!!
        
        _Wrap_text = ImageVector.Builder(
            name = "wrap_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(588f, 828f)
                lineTo(440f, 680f)
                lineToRelative(148f, -148f)
                lineToRelative(56f, 58f)
                lineToRelative(-50f, 50f)
                horizontalLineToRelative(96f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(760f, 570f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(690f, 500f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(530f)
                quadToRelative(63f, 0f, 106.5f, 43.5f)
                reflectiveQuadTo(840f, 570f)
                quadToRelative(0f, 63f, -43.5f, 106.5f)
                reflectiveQuadTo(690f, 720f)
                horizontalLineToRelative(-96f)
                lineToRelative(50f, 50f)
                lineToRelative(-56f, 58f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Wrap_text!!
    }

private var _Wrap_text: ImageVector? = null

