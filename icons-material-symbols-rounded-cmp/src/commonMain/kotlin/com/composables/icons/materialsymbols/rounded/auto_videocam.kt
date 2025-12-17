package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Auto_videocam: ImageVector
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
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(720f, 636f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 896f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineTo(336f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(336f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(190f, -190f)
                lineToRelative(32f, 70f)
                quadToRelative(5f, 12f, 18f, 12f)
                reflectiveQuadToRelative(18f, -12f)
                lineToRelative(32f, -70f)
                lineToRelative(70f, -32f)
                quadToRelative(12f, -5f, 12f, -18f)
                reflectiveQuadToRelative(-12f, -18f)
                lineToRelative(-70f, -32f)
                lineToRelative(-32f, -70f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-32f, 70f)
                lineToRelative(-70f, 32f)
                quadToRelative(-12f, 5f, -12f, 18f)
                reflectiveQuadToRelative(12f, 18f)
                lineToRelative(70f, 32f)
                close()
            }
        }.build()
        
        return _Auto_videocam!!
    }

private var _Auto_videocam: ImageVector? = null

