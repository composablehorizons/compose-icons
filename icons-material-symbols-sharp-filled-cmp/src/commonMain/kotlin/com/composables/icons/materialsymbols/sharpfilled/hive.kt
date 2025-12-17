package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hive: ImageVector
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
                moveTo(651f, 460f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, 120f)
                lineToRelative(-68f, 120f)
                horizontalLineTo(651f)
                close()
                moveTo(413f, 600f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, 120f)
                lineToRelative(-68f, 120f)
                horizontalLineTo(413f)
                close()
                moveToRelative(0f, -280f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, 120f)
                lineToRelative(-68f, 120f)
                horizontalLineTo(413f)
                close()
                moveTo(175f, 460f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(65f, 120f)
                lineToRelative(-65f, 120f)
                horizontalLineTo(175f)
                close()
                moveToRelative(0f, 280f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(65f, 120f)
                lineToRelative(-65f, 120f)
                horizontalLineTo(175f)
                close()
                moveTo(417f, 880f)
                lineToRelative(-72f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, 120f)
                lineToRelative(-68f, 120f)
                horizontalLineTo(417f)
                close()
                moveToRelative(234f, -140f)
                lineToRelative(-68f, -120f)
                lineToRelative(68f, -120f)
                horizontalLineToRelative(134f)
                lineToRelative(68f, 120f)
                lineToRelative(-68f, 120f)
                horizontalLineTo(651f)
                close()
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

