package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Power: ImageVector
    get() {
        if (_Power != null) return _Power!!
        
        _Power = ImageVector.Builder(
            name = "power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-74f)
                lineToRelative(140f, -140f)
                verticalLineToRelative(-186f)
                horizontalLineTo(320f)
                verticalLineToRelative(186f)
                lineToRelative(140f, 140f)
                verticalLineToRelative(74f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-120f)
                lineTo(240f, 580f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(300f)
                lineTo(580f, 720f)
                verticalLineToRelative(120f)
                horizontalLineTo(380f)
                close()
                moveToRelative(100f, -280f)
                close()
            }
        }.build()
        
        return _Power!!
    }

private var _Power: ImageVector? = null

