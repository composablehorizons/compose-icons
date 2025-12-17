package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pulmonology: ImageVector
    get() {
        if (_Pulmonology != null) return _Pulmonology!!
        
        _Pulmonology = ImageVector.Builder(
            name = "pulmonology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                horizontalLineTo(80f)
                verticalLineToRelative(-287f)
                lineToRelative(132f, -353f)
                horizontalLineToRelative(188f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-52f)
                lineTo(160f, 567f)
                verticalLineToRelative(193f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-193f)
                lineTo(692f, 280f)
                horizontalLineToRelative(-52f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(188f)
                lineToRelative(132f, 353f)
                verticalLineToRelative(287f)
                close()
                moveTo(348f, 532f)
                close()
                moveToRelative(264f, 0f)
                close()
                moveToRelative(-132f, -76f)
                lineTo(376f, 560f)
                lineToRelative(-56f, -56f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(-304f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(304f)
                lineToRelative(120f, 120f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -104f)
                close()
            }
        }.build()
        
        return _Pulmonology!!
    }

private var _Pulmonology: ImageVector? = null

