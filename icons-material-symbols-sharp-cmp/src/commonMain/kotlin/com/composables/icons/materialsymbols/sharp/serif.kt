package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Serif: ImageVector
    get() {
        if (_Serif != null) return _Serif!!
        
        _Serif = ImageVector.Builder(
            name = "serif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 720f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-51f)
                lineToRelative(53f, -147f)
                horizontalLineToRelative(134f)
                lineToRelative(50f, 147f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(222f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-31f)
                lineTo(509f, 240f)
                horizontalLineToRelative(-55f)
                lineTo(280f, 707f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(13f)
                close()
                moveToRelative(112f, -175f)
                lineToRelative(64f, -178f)
                lineToRelative(59f, 178f)
                horizontalLineTo(360f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Serif!!
    }

private var _Serif: ImageVector? = null

