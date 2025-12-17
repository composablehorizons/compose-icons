package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chrome_tote: ImageVector
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
                moveTo(513f, 856f)
                horizontalLineToRelative(226f)
                verticalLineToRelative(51f)
                lineToRelative(-589f, 74f)
                lineToRelative(-74f, -597f)
                lineToRelative(125f, -14f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 4f)
                lineToRelative(54f, 438f)
                lineToRelative(294f, -36f)
                close()
                moveToRelative(-232f, -80f)
                verticalLineTo(176f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(600f)
                horizontalLineTo(281f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(440f)
                verticalLineTo(256f)
                horizontalLineTo(361f)
                verticalLineToRelative(440f)
                close()
                moveTo(219f, 892f)
                close()
                moveToRelative(142f, -196f)
                verticalLineTo(256f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(220f, -60f)
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
            }
        }.build()
        
        return _Chrome_tote!!
    }

private var _Chrome_tote: ImageVector? = null

