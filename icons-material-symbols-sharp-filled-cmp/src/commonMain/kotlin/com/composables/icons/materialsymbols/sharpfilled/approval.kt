package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Approval: ImageVector
    get() {
        if (_Approval != null) return _Approval!!
        
        _Approval = ImageVector.Builder(
            name = "approval",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(320f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(240f, -160f)
                lineTo(280f, 280f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 280f)
                lineTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Approval!!
    }

private var _Approval: ImageVector? = null

