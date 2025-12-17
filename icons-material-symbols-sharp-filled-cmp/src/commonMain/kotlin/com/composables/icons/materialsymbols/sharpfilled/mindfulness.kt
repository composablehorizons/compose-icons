package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mindfulness: ImageVector
    get() {
        if (_Mindfulness != null) return _Mindfulness!!
        
        _Mindfulness = ImageVector.Builder(
            name = "mindfulness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-172f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(65f, 255f)
                horizontalLineTo(760f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(200f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(120f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(-240f, -20f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Mindfulness!!
    }

private var _Mindfulness: ImageVector? = null

