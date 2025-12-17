package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ClinicMedical: ImageVector
    get() {
        if (_ClinicMedical != null) return _ClinicMedical!!
        
        _ClinicMedical = ImageVector.Builder(
            name = "clinic-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 115f)
                lineTo(69.47f, 307.71f)
                curveToRelative(-1.62f, 1.46f, -3.69f, 2.14f, -5.47f, 3.35f)
                verticalLineTo(496f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(311.1f)
                curveToRelative(-1.7f, -1.16f, -3.72f, -1.82f, -5.26f, -3.2f)
                close()
                moveToRelative(96f, 261f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                close()
                moveToRelative(186.69f, -139.72f)
                lineToRelative(-255.94f, -226f)
                arcToRelative(39.85f, 39.85f, 0f, false, false, -53.45f, 0f)
                lineToRelative(-256f, 226f)
                arcToRelative(16f, 16f, 0f, false, false, -1.21f, 22.6f)
                lineTo(25.5f, 282.7f)
                arcToRelative(16f, 16f, 0f, false, false, 22.6f, 1.21f)
                lineTo(277.42f, 81.63f)
                arcToRelative(16f, 16f, 0f, false, true, 21.17f, 0f)
                lineTo(527.91f, 283.9f)
                arcToRelative(16f, 16f, 0f, false, false, 22.6f, -1.21f)
                lineToRelative(21.4f, -23.82f)
                arcToRelative(16f, 16f, 0f, false, false, -1.22f, -22.59f)
                close()
            }
        }.build()
        
        return _ClinicMedical!!
    }

private var _ClinicMedical: ImageVector? = null

