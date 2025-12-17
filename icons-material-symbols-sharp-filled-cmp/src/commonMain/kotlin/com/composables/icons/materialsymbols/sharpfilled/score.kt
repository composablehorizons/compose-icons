package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Score: ImageVector
    get() {
        if (_Score != null) return _Score!!
        
        _Score = ImageVector.Builder(
            name = "score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -360f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(68f)
                lineToRelative(-80f, -120f)
                lineToRelative(80f, -120f)
                horizontalLineToRelative(-68f)
                lineToRelative(-80f, 120f)
                lineToRelative(80f, 120f)
                close()
                moveToRelative(-340f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(340f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-150f)
                horizontalLineTo(280f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(30f)
                horizontalLineTo(280f)
                verticalLineToRelative(150f)
                close()
                moveToRelative(480f, 40f)
                verticalLineToRelative(-100f)
                lineTo(520f, 660f)
                lineTo(360f, 500f)
                lineTo(200f, 660f)
                verticalLineToRelative(100f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(240f, -240f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null

