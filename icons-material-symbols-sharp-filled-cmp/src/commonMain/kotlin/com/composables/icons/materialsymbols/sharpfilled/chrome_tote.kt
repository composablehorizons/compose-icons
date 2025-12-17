package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chrome_tote: ImageVector
    get() {
        if (_Chrome_tote != null) return _Chrome_tote!!
        
        _Chrome_tote = ImageVector.Builder(
            name = "chrome_tote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(581f, 636f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -57f)
                lineToRelative(-64f, 63f)
                verticalLineTo(316f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(166f)
                lineToRelative(-64f, -63f)
                lineToRelative(-56f, 57f)
                lineToRelative(160f, 160f)
                close()
                moveTo(150f, 981f)
                lineTo(76f, 384f)
                lineToRelative(125f, -14f)
                verticalLineToRelative(486f)
                horizontalLineToRelative(538f)
                verticalLineToRelative(51f)
                lineToRelative(-589f, 74f)
                close()
                moveToRelative(131f, -205f)
                verticalLineTo(176f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(281f)
                close()
            }
        }.build()
        
        return _Chrome_tote!!
    }

private var _Chrome_tote: ImageVector? = null

