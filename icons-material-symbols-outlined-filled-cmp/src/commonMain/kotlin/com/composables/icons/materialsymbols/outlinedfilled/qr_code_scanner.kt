package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Qr_code_scanner: ImageVector
    get() {
        if (_Qr_code_scanner != null) return _Qr_code_scanner!!
        
        _Qr_code_scanner = ImageVector.Builder(
            name = "qr_code_scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 600f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
                moveToRelative(120f, -600f)
                verticalLineToRelative(-120f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(700f, 700f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-60f, 60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-60f, 60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-60f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-60f, 60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-60f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(240f, -320f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                close()
                moveTo(440f, 520f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(-60f, 500f)
                verticalLineToRelative(-120f)
                horizontalLineTo(260f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-120f)
                horizontalLineTo(260f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(580f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Qr_code_scanner!!
    }

private var _Qr_code_scanner: ImageVector? = null

