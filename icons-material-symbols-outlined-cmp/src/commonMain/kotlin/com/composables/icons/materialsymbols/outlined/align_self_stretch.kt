package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Align_self_stretch: ImageVector
    get() {
        if (_Align_self_stretch != null) return _Align_self_stretch!!
        
        _Align_self_stretch = ImageVector.Builder(
            name = "align_self_stretch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(340f, -180f)
                verticalLineToRelative(-460f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(460f)
                horizontalLineTo(420f)
                close()
            }
        }.build()
        
        return _Align_self_stretch!!
    }

private var _Align_self_stretch: ImageVector? = null

