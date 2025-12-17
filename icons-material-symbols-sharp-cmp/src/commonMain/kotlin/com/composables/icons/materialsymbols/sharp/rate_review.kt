package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rate_review: ImageVector
    get() {
        if (_Rate_review != null) return _Rate_review!!
        
        _Rate_review = ImageVector.Builder(
            name = "rate_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 560f)
                horizontalLineToRelative(122f)
                lineToRelative(241f, -241f)
                lineToRelative(-119f, -125f)
                lineToRelative(-244f, 244f)
                verticalLineToRelative(122f)
                close()
                moveToRelative(280f, -243f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(300f, 500f)
                verticalLineToRelative(-38f)
                lineToRelative(101f, -101f)
                lineToRelative(20f, 18f)
                lineToRelative(18f, 20f)
                lineToRelative(-101f, 101f)
                horizontalLineToRelative(-38f)
                close()
                moveToRelative(121f, -121f)
                lineToRelative(18f, 20f)
                lineToRelative(-38f, -38f)
                lineToRelative(20f, 18f)
                close()
                moveToRelative(26f, 181f)
                horizontalLineToRelative(273f)
                verticalLineToRelative(-80f)
                horizontalLineTo(527f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
                moveToRelative(126f, -240f)
                horizontalLineToRelative(594f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(525f)
                lineToRelative(46f, -45f)
                close()
                moveToRelative(-46f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Rate_review!!
    }

private var _Rate_review: ImageVector? = null

