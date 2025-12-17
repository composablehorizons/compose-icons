package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ecg: ImageVector
    get() {
        if (_Ecg != null) return _Ecg!!
        
        _Ecg = ImageVector.Builder(
            name = "ecg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(720f, 900f)
                lineToRelative(-61f, -52f)
                quadToRelative(-88f, -75f, -113.5f, -108.5f)
                reflectiveQuadTo(520f, 670f)
                quadToRelative(0f, -45f, 32f, -77.5f)
                reflectiveQuadToRelative(78f, -32.5f)
                quadToRelative(26f, 0f, 49.5f, 12f)
                reflectiveQuadToRelative(40.5f, 35f)
                quadToRelative(16f, -23f, 39.5f, -35f)
                reflectiveQuadToRelative(50.5f, -12f)
                quadToRelative(45f, 0f, 77.5f, 32.5f)
                reflectiveQuadTo(920f, 670f)
                quadToRelative(0f, 36f, -26f, 69.5f)
                reflectiveQuadTo(780f, 848f)
                lineToRelative(-60f, 52f)
                close()
                moveToRelative(0f, -106f)
                lineToRelative(28f, -23f)
                quadToRelative(56f, -48f, 74f, -67.5f)
                reflectiveQuadToRelative(18f, -33.5f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-8f, 0f, -14.5f, 3.5f)
                reflectiveQuadTo(780f, 655f)
                lineToRelative(-60f, 57f)
                lineToRelative(-61f, -57f)
                quadToRelative(-9f, -8f, -15.5f, -11.5f)
                reflectiveQuadTo(630f, 640f)
                quadToRelative(-13f, 0f, -21.5f, 9f)
                reflectiveQuadToRelative(-8.5f, 21f)
                quadToRelative(0f, 14f, 17.5f, 33.5f)
                reflectiveQuadTo(691f, 771f)
                lineToRelative(29f, 23f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineToRelative(56f, 111f)
                lineToRelative(134f, -271f)
                horizontalLineToRelative(51f)
                lineToRelative(79f, 160f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(80f)
                horizontalLineTo(495f)
                lineToRelative(-55f, -110f)
                lineToRelative(-135f, 270f)
                horizontalLineToRelative(-50f)
                lineToRelative(-80f, -160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 197f)
                close()
            }
        }.build()
        
        return _Ecg!!
    }

private var _Ecg: ImageVector? = null

