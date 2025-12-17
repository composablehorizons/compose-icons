package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hive: ImageVector
    get() {
        if (_Hive != null) return _Hive!!
        
        _Hive = ImageVector.Builder(
            name = "hive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 880f)
                lineToRelative(-68f, -120f)
                horizontalLineTo(190f)
                lineToRelative(-90f, -160f)
                lineToRelative(68f, -120f)
                lineToRelative(-68f, -120f)
                lineToRelative(90f, -160f)
                horizontalLineToRelative(132f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(180f)
                lineToRelative(68f, 120f)
                horizontalLineToRelative(132f)
                lineToRelative(90f, 160f)
                lineToRelative(-68f, 120f)
                lineToRelative(68f, 120f)
                lineToRelative(-90f, 160f)
                horizontalLineTo(638f)
                lineTo(570f, 880f)
                horizontalLineTo(390f)
                close()
                moveToRelative(248f, -440f)
                horizontalLineToRelative(86f)
                lineToRelative(44f, -80f)
                lineToRelative(-44f, -80f)
                horizontalLineToRelative(-86f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
                moveTo(438f, 560f)
                horizontalLineToRelative(84f)
                lineToRelative(45f, -80f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-84f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(84f)
                lineToRelative(46f, -81f)
                lineToRelative(-45f, -79f)
                horizontalLineToRelative(-86f)
                lineToRelative(-45f, 79f)
                lineToRelative(46f, 81f)
                close()
                moveTo(237f, 440f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -80f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-85f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -80f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-86f)
                lineToRelative(-44f, 80f)
                lineToRelative(45f, 80f)
                close()
                moveToRelative(200f, 120f)
                horizontalLineToRelative(86f)
                lineToRelative(45f, -79f)
                lineToRelative(-46f, -81f)
                horizontalLineToRelative(-84f)
                lineToRelative(-46f, 81f)
                lineToRelative(45f, 79f)
                close()
                moveToRelative(201f, -120f)
                horizontalLineToRelative(85f)
                lineToRelative(45f, -80f)
                lineToRelative(-45f, -80f)
                horizontalLineToRelative(-85f)
                lineToRelative(-45f, 80f)
                lineToRelative(45f, 80f)
                close()
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

