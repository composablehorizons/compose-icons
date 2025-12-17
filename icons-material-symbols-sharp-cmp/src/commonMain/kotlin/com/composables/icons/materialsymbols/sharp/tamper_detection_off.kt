package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tamper_detection_off: ImageVector
    get() {
        if (_Tamper_detection_off != null) return _Tamper_detection_off!!
        
        _Tamper_detection_off = ImageVector.Builder(
            name = "tamper_detection_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 700f)
                lineTo(720f, 540f)
                verticalLineToRelative(68f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-288f)
                horizontalLineTo(352f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveTo(822f, 934f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(460f, 460f)
                close()
                moveToRelative(36f, -76f)
                close()
                moveTo(145f, 920f)
                lineTo(0f, 776f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-324f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(440f)
                horizontalLineTo(145f)
                close()
            }
        }.build()
        
        return _Tamper_detection_off!!
    }

private var _Tamper_detection_off: ImageVector? = null

