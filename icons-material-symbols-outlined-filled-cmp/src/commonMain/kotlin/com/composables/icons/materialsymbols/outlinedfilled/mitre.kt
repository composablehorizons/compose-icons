package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mitre: ImageVector
    get() {
        if (_Mitre != null) return _Mitre!!
        
        _Mitre = ImageVector.Builder(
            name = "mitre",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(700f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                close()
                moveTo(160f, 920f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(240f)
                horizontalLineTo(340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Mitre!!
    }

private var _Mitre: ImageVector? = null

