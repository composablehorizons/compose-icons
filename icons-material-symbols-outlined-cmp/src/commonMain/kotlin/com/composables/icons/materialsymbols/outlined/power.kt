package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Power: ImageVector
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
                verticalLineToRelative(-220f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(40f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 360f)
                verticalLineToRelative(220f)
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

