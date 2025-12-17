package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_videocam: ImageVector
    get() {
        if (_Auto_videocam != null) return _Auto_videocam!!
        
        _Auto_videocam = ImageVector.Builder(
            name = "auto_videocam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 896f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 336f)
                verticalLineToRelative(180f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 636f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 896f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -160f)
                lineToRelative(50f, -110f)
                lineToRelative(110f, -50f)
                lineToRelative(-110f, -50f)
                lineToRelative(-50f, -110f)
                lineToRelative(-50f, 110f)
                lineToRelative(-110f, 50f)
                lineToRelative(110f, 50f)
                lineToRelative(50f, 110f)
                close()
            }
        }.build()
        
        return _Auto_videocam!!
    }

private var _Auto_videocam: ImageVector? = null

