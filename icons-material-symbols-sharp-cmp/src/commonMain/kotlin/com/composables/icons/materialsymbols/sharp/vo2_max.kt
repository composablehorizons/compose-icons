package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vo2_max: ImageVector
    get() {
        if (_Vo2_max != null) return _Vo2_max!!
        
        _Vo2_max = ImageVector.Builder(
            name = "vo2_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-419f)
                lineToRelative(280f, -221f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                lineToRelative(280f, 220f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-99f)
                lineToRelative(-120f, -96f)
                verticalLineToRelative(475f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-538f)
                lineToRelative(-40f, -32f)
                lineToRelative(-40f, 32f)
                lineToRelative(2f, 538f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(122f)
                lineToRelative(-2f, -395f)
                lineToRelative(-120f, 96f)
                verticalLineToRelative(299f)
                close()
                moveToRelative(400f, 80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                close()
                moveToRelative(60f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(740f, 880f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-30f)
                horizontalLineTo(740f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(150f)
                horizontalLineTo(800f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineTo(740f)
                close()
                moveTo(181f, 522f)
                close()
                moveToRelative(359f, 0f)
                close()
            }
        }.build()
        
        return _Vo2_max!!
    }

private var _Vo2_max: ImageVector? = null

