package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sweep: ImageVector
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
                lineTo(14f, 492.2f)
                lineTo(71f, 435f)
                lineToRelative(171f, 171f)
                lineToRelative(366.87f, -367f)
                lineTo(666f, 296f)
                lineTo(242f, 720f)
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

