package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tsv: ImageVector
    get() {
        if (_Tsv != null) return _Tsv!!
        
        _Tsv = ImageVector.Builder(
            name = "tsv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(170f, -200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-60f)
                horizontalLineTo(200f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(130f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-146f)
                horizontalLineTo(440f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(380f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(36f)
                horizontalLineTo(380f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(250f, 0f)
                horizontalLineToRelative(60f)
                lineToRelative(70f, -240f)
                horizontalLineToRelative(-60f)
                lineToRelative(-40f, 138f)
                lineToRelative(-40f, -138f)
                horizontalLineToRelative(-60f)
                lineToRelative(70f, 240f)
                close()
            }
        }.build()
        
        return _Tsv!!
    }

private var _Tsv: ImageVector? = null

