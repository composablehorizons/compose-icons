package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sweep: ImageVector
    get() {
        if (_Sweep != null) return _Sweep!!
        
        _Sweep = ImageVector.Builder(
            name = "sweep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-158f, 0f)
                lineTo(15f, 493f)
                lineToRelative(57f, -57f)
                lineToRelative(170f, 170f)
                lineToRelative(366f, -366f)
                lineToRelative(57f, 57f)
                lineToRelative(-423f, 423f)
                close()
                moveToRelative(318f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Sweep!!
    }

private var _Sweep: ImageVector? = null

