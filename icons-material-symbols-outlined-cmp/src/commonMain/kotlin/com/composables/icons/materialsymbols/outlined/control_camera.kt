package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Control_camera: ImageVector
    get() {
        if (_Control_camera != null) return _Control_camera!!
        
        _Control_camera = ImageVector.Builder(
            name = "control_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479f, 601f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, 279f)
                lineTo(309f, 710f)
                lineToRelative(57f, -57f)
                lineToRelative(114f, 114f)
                lineToRelative(113f, -113f)
                lineToRelative(56f, 56f)
                lineTo(479f, 880f)
                close()
                moveTo(249f, 651f)
                lineTo(79f, 481f)
                lineToRelative(170f, -170f)
                lineToRelative(57f, 57f)
                lineToRelative(-114f, 114f)
                lineToRelative(113f, 113f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(116f, -345f)
                lineToRelative(-56f, -56f)
                lineToRelative(170f, -170f)
                lineToRelative(170f, 170f)
                lineToRelative(-57f, 57f)
                lineToRelative(-114f, -114f)
                lineToRelative(-113f, 113f)
                close()
                moveToRelative(344f, 345f)
                lineToRelative(-57f, -57f)
                lineToRelative(114f, -114f)
                lineToRelative(-113f, -113f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(-170f, 170f)
                close()
            }
        }.build()
        
        return _Control_camera!!
    }

private var _Control_camera: ImageVector? = null

