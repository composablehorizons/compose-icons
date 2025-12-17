package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RecordVinyl: ImageVector
    get() {
        if (_RecordVinyl != null) return _RecordVinyl!!
        
        _RecordVinyl = ImageVector.Builder(
            name = "record-vinyl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 152f)
                arcToRelative(104f, 104f, 0f, true, false, 104f, 104f)
                arcToRelative(104f, 104f, 0f, false, false, -104f, -104f)
                close()
                moveToRelative(0f, 128f)
                arcToRelative(24f, 24f, 0f, true, true, 24f, -24f)
                arcToRelative(24f, 24f, 0f, false, true, -24f, 24f)
                close()
                moveToRelative(0f, -272f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 376f)
                arcToRelative(128f, 128f, 0f, true, true, 128f, -128f)
                arcToRelative(128f, 128f, 0f, false, true, -128f, 128f)
                close()
            }
        }.build()
        
        return _RecordVinyl!!
    }

private var _RecordVinyl: ImageVector? = null

